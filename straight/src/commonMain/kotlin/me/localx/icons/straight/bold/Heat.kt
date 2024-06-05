package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Heat: ImageVector
    get() {
        if (_heat != null) {
            return _heat!!
        }
        _heat = Builder(name = "Heat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.949f, 23.988f)
                lineToRelative(-2.9f, -0.774f)
                curveToRelative(0.119f, -0.445f, 0.252f, -0.859f, 0.384f, -1.265f)
                arcTo(8.628f, 8.628f, 0.0f, false, false, 21.0f, 19.1f)
                arcToRelative(10.515f, 10.515f, 0.0f, false, false, -1.778f, -5.728f)
                arcTo(13.467f, 13.467f, 0.0f, false, true, 17.0f, 6.08f)
                arcTo(17.7f, 17.7f, 0.0f, false, true, 18.382f, 0.036f)
                lineToRelative(2.736f, 1.23f)
                arcTo(14.863f, 14.863f, 0.0f, false, false, 20.0f, 6.08f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, false, 1.778f, 5.727f)
                arcTo(13.485f, 13.485f, 0.0f, false, true, 24.0f, 19.1f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, -0.711f, 3.767f)
                curveTo(23.173f, 23.23f, 23.054f, 23.6f, 22.949f, 23.988f)
                close()
                moveTo(15.289f, 22.871f)
                arcTo(11.3f, 11.3f, 0.0f, false, false, 16.0f, 19.1f)
                arcToRelative(13.485f, 13.485f, 0.0f, false, false, -2.222f, -7.3f)
                arcTo(10.5f, 10.5f, 0.0f, false, true, 12.0f, 6.08f)
                arcToRelative(14.863f, 14.863f, 0.0f, false, true, 1.118f, -4.814f)
                lineTo(10.382f, 0.036f)
                arcTo(17.7f, 17.7f, 0.0f, false, false, 9.0f, 6.08f)
                arcToRelative(13.467f, 13.467f, 0.0f, false, false, 2.222f, 7.3f)
                arcTo(10.515f, 10.515f, 0.0f, false, true, 13.0f, 19.1f)
                arcToRelative(8.628f, 8.628f, 0.0f, false, true, -0.565f, 2.845f)
                curveToRelative(-0.132f, 0.406f, -0.265f, 0.82f, -0.384f, 1.265f)
                lineToRelative(2.9f, 0.774f)
                curveTo(15.054f, 23.6f, 15.173f, 23.23f, 15.289f, 22.871f)
                close()
                moveTo(7.289f, 22.871f)
                arcTo(11.3f, 11.3f, 0.0f, false, false, 8.0f, 19.1f)
                arcToRelative(13.485f, 13.485f, 0.0f, false, false, -2.222f, -7.3f)
                arcTo(10.5f, 10.5f, 0.0f, false, true, 4.0f, 6.08f)
                arcTo(14.863f, 14.863f, 0.0f, false, true, 5.118f, 1.266f)
                lineTo(2.382f, 0.036f)
                arcTo(17.7f, 17.7f, 0.0f, false, false, 1.0f, 6.08f)
                arcToRelative(13.467f, 13.467f, 0.0f, false, false, 2.222f, 7.3f)
                arcTo(10.515f, 10.515f, 0.0f, false, true, 5.0f, 19.1f)
                arcToRelative(8.628f, 8.628f, 0.0f, false, true, -0.565f, 2.845f)
                curveToRelative(-0.132f, 0.406f, -0.265f, 0.82f, -0.384f, 1.265f)
                lineToRelative(2.9f, 0.774f)
                curveTo(7.054f, 23.6f, 7.173f, 23.23f, 7.289f, 22.871f)
                close()
            }
        }
        .build()
        return _heat!!
    }

private var _heat: ImageVector? = null
