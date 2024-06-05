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

public val Icons.Outline.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.715f, 2.285f)
                arcToRelative(1.013f, 1.013f, 0.0f, false, false, -1.43f, 0.0f)
                lineTo(17.521f, 7.049f)
                lineToRelative(-0.32f, -0.313f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -6.429f, -0.479f)
                arcTo(16.618f, 16.618f, 0.0f, false, true, 6.224f, 8.685f)
                lineTo(4.15f, 9.293f)
                arcToRelative(5.036f, 5.036f, 0.0f, false, false, -3.113f, 2.635f)
                arcTo(4.973f, 4.973f, 0.0f, false, false, 0.9f, 15.947f)
                arcToRelative(12.95f, 12.95f, 0.0f, false, false, 12.112f, 8.064f)
                horizontalLineToRelative(0.924f)
                arcToRelative(1.011f, 1.011f, 0.0f, false, false, 0.578f, -0.182f)
                arcTo(15.288f, 15.288f, 0.0f, false, false, 21.224f, 13.62f)
                arcToRelative(5.029f, 5.029f, 0.0f, false, false, -1.453f, -4.374f)
                lineToRelative(-0.8f, -0.784f)
                lineToRelative(4.747f, -4.747f)
                arcTo(1.013f, 1.013f, 0.0f, false, false, 23.715f, 2.285f)
                close()
                moveTo(13.608f, 21.985f)
                horizontalLineToRelative(-0.6f)
                arcTo(11.3f, 11.3f, 0.0f, false, true, 8.7f, 21.138f)
                lineToRelative(0.011f, -0.006f)
                arcToRelative(11.546f, 11.546f, 0.0f, false, false, 4.351f, -3.8f)
                lineToRelative(0.518f, -0.761f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -1.67f, -1.138f)
                lineToRelative(-0.518f, 0.761f)
                arcTo(9.535f, 9.535f, 0.0f, false, true, 7.8f, 19.327f)
                lineToRelative(-1.251f, 0.63f)
                arcToRelative(10.757f, 10.757f, 0.0f, false, true, -2.583f, -2.57f)
                arcToRelative(11.625f, 11.625f, 0.0f, false, false, 4.377f, -2.664f)
                arcToRelative(1.011f, 1.011f, 0.0f, false, false, -1.414f, -1.446f)
                arcToRelative(9.617f, 9.617f, 0.0f, false, true, -3.98f, 2.32f)
                curveToRelative(-0.061f, -0.135f, -0.127f, -0.267f, -0.182f, -0.406f)
                arcToRelative(2.906f, 2.906f, 0.0f, false, true, 0.085f, -2.381f)
                arcToRelative(3.023f, 3.023f, 0.0f, false, true, 1.864f, -1.578f)
                lineToRelative(2.073f, -0.608f)
                arcToRelative(15.364f, 15.364f, 0.0f, false, false, 3.426f, -1.588f)
                lineToRelative(7.915f, 7.712f)
                arcTo(14.192f, 14.192f, 0.0f, false, true, 13.608f, 21.989f)
                close()
                moveTo(19.228f, 13.302f)
                arcToRelative(12.421f, 12.421f, 0.0f, false, true, -0.309f, 1.387f)
                lineTo(11.948f, 7.9f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, 1.755f, -0.566f)
                arcToRelative(2.973f, 2.973f, 0.0f, false, true, 2.084f, 0.849f)
                lineToRelative(2.569f, 2.509f)
                arcTo(3.01f, 3.01f, 0.0f, false, true, 19.228f, 13.306f)
                close()
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
