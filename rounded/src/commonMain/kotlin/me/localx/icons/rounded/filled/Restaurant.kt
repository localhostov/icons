package me.localx.icons.rounded.filled

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

public val Icons.Filled.Restaurant: ImageVector
    get() {
        if (_restaurant != null) {
            return _restaurant!!
        }
        _restaurant = Builder(name = "Restaurant", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.729f, 22.314f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.458f, 1.371f)
                lineToRelative(-5.483f, -5.839f)
                curveToRelative(-1.036f, 0.033f, -5.807f, 0.175f, -4.312f, -2.08f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, true, 0.981f, -0.254f)
                arcToRelative(8.055f, 8.055f, 0.0f, false, false, 3.458f, 0.29f)
                arcToRelative(1.259f, 1.259f, 0.0f, false, true, 1.09f, 0.4f)
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
                moveTo(5.452f, 12.965f)
                curveToRelative(0.829f, 0.781f, 1.594f, -0.256f, 2.151f, -0.811f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.539f, -1.8f)
                curveToRelative(-0.617f, -1.722f, 0.891f, -3.732f, -0.357f, -5.117f)
                lineTo(3.329f, 0.573f)
                arcTo(1.962f, 1.962f, 0.0f, false, false, 0.0f, 1.952f)
                curveTo(0.237f, 6.566f, 1.935f, 8.92f, 5.452f, 12.965f)
                close()
            }
        }
        .build()
        return _restaurant!!
    }

private var _restaurant: ImageVector? = null
