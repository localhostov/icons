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

public val Icons.Outline.CarTilt: ImageVector
    get() {
        if (_carTilt != null) {
            return _carTilt!!
        }
        _carTilt = Builder(name = "CarTilt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.673f, 13.937f)
                arcToRelative(9.876f, 9.876f, 0.0f, false, false, 1.0f, 3.2f)
                lineToRelative(0.533f, 1.03f)
                arcTo(3.986f, 3.986f, 0.0f, false, false, 8.122f, 19.8f)
                lineToRelative(0.145f, 0.239f)
                arcToRelative(1.987f, 1.987f, 0.0f, true, false, 3.405f, -2.05f)
                lineToRelative(-0.066f, -0.111f)
                lineToRelative(7.01f, -3.929f)
                lineToRelative(0.193f, 0.321f)
                arcToRelative(1.988f, 1.988f, 0.0f, true, false, 3.406f, -2.051f)
                lineToRelative(-0.223f, -0.37f)
                arcToRelative(3.957f, 3.957f, 0.0f, false, false, 0.965f, -1.771f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.422f, -2.955f)
                lineTo(22.0f, 6.091f)
                arcTo(7.241f, 7.241f, 0.0f, false, false, 19.49f, 3.509f)
                lineTo(15.2f, 0.688f)
                arcTo(4.955f, 4.955f, 0.0f, false, false, 10.26f, 0.74f)
                lineTo(3.388f, 4.357f)
                arcTo(4.984f, 4.984f, 0.0f, false, false, 0.98f, 8.733f)
                curveTo(0.981f, 8.77f, 1.673f, 13.937f, 1.673f, 13.937f)
                close()
                moveTo(20.79f, 8.094f)
                arcToRelative(1.982f, 1.982f, 0.0f, false, true, -0.663f, 2.713f)
                lineToRelative(-12.49f, 7.0f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.5f, 0.226f)
                arcToRelative(1.946f, 1.946f, 0.0f, false, true, -1.187f, -0.843f)
                lineToRelative(-0.533f, -1.03f)
                arcToRelative(3.605f, 3.605f, 0.0f, false, true, -0.253f, -0.526f)
                lineToRelative(1.663f, -0.947f)
                lineToRelative(0.5f, 0.808f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.7f, -1.047f)
                lineTo(7.565f, 13.7f)
                lineToRelative(8.968f, -5.107f)
                lineToRelative(0.56f, 0.929f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.713f, -1.032f)
                lineTo(18.272f, 7.6f)
                lineToRelative(1.7f, -0.968f)
                curveToRelative(0.1f, 0.139f, 0.2f, 0.283f, 0.286f, 0.431f)
                close()
                moveTo(4.369f, 6.1f)
                lineToRelative(6.872f, -3.617f)
                arcTo(2.96f, 2.96f, 0.0f, false, true, 14.166f, 2.4f)
                lineToRelative(4.27f, 2.81f)
                lineTo(3.649f, 13.626f)
                lineToRelative(-0.67f, -4.99f)
                arcTo(2.962f, 2.962f, 0.0f, false, true, 4.369f, 6.1f)
                close()
                moveTo(24.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 24.0f, 23.0f)
                close()
            }
        }
        .build()
        return _carTilt!!
    }

private var _carTilt: ImageVector? = null
