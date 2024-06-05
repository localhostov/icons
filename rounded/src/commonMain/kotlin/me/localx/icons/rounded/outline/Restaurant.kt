package me.localx.icons.rounded.outline

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

public val Icons.Outline.Restaurant: ImageVector
    get() {
        if (_restaurant != null) {
            return _restaurant!!
        }
        _restaurant = Builder(name = "Restaurant", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.333f, 7.238f)
                curveTo(0.484f, 5.522f, -1.2f, 1.269f, 1.2f, 0.15f)
                arcTo(1.949f, 1.949f, 0.0f, false, true, 3.329f, 0.573f)
                lineToRelative(4.96f, 5.3f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 6.887f, 7.3f)
                lineTo(2.0f, 2.08f)
                curveToRelative(0.119f, 3.777f, 2.343f, 6.6f, 4.841f, 9.439f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.39f, 1.446f)
                arcTo(24.522f, 24.522f, 0.0f, false, true, 1.333f, 7.238f)
                close()
                moveTo(18.005f, 16.2f)
                arcToRelative(1.259f, 1.259f, 0.0f, false, false, -1.09f, -0.4f)
                arcToRelative(8.055f, 8.055f, 0.0f, false, true, -3.458f, -0.29f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, false, -0.981f, 0.254f)
                curveToRelative(-1.494f, 2.256f, 3.274f, 2.113f, 4.312f, 2.08f)
                lineToRelative(5.483f, 5.839f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.458f, -1.371f)
                close()
                moveTo(15.0f, 14.0f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, false, 3.536f, -1.462f)
                lineToRelative(5.171f, -5.172f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 22.293f, 5.95f)
                lineToRelative(-5.171f, 5.172f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.406f, 0.576f)
                lineToRelative(6.991f, -6.991f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineTo(12.3f, 10.284f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.576f, -3.406f)
                lineTo(18.05f, 1.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.636f, 0.293f)
                lineTo(11.464f, 5.464f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, -0.635f, 6.293f)
                lineTo(0.293f, 22.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                lineTo(12.243f, 13.171f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 15.0f, 14.0f)
                close()
            }
        }
        .build()
        return _restaurant!!
    }

private var _restaurant: ImageVector? = null
