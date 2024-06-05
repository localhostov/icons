package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.GrinTongueWink: ImageVector
    get() {
        if (_grinTongueWink != null) {
            return _grinTongueWink!!
        }
        _grinTongueWink = Builder(name = "GrinTongueWink", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.667f)
                curveTo(18.0f, 11.0f, 16.881f, 11.0f, 15.5f, 11.0f)
                reflectiveCurveTo(13.0f, 11.0f, 13.0f, 9.667f)
                arcTo(2.587f, 2.587f, 0.0f, false, true, 15.5f, 7.0f)
                arcTo(2.587f, 2.587f, 0.0f, false, true, 18.0f, 9.667f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                curveTo(-3.9f, 23.4f, -3.893f, 0.6f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, false, -9.0f, -9.0f)
                curveTo(0.077f, 3.453f, 0.08f, 20.549f, 12.0f, 21.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, false, 21.0f, 12.0f)
                close()
                moveTo(9.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(16.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(9.023f, 16.0f)
                curveToRelative(0.48f, 3.97f, 5.476f, 3.966f, 5.954f, 0.0f)
                lineTo(16.0f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _grinTongueWink!!
    }

private var _grinTongueWink: ImageVector? = null
