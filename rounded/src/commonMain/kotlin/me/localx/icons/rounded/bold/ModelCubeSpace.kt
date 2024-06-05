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

public val Icons.Bold.ModelCubeSpace: ImageVector
    get() {
        if (_modelCubeSpace != null) {
            return _modelCubeSpace!!
        }
        _modelCubeSpace = Builder(name = "ModelCubeSpace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.849f)
                lineToRelative(-4.004f, -2.288f)
                lineToRelative(3.023f, -1.728f)
                curveToRelative(0.608f, -0.347f, 1.354f, -0.347f, 1.962f, 0.0f)
                lineToRelative(3.023f, 1.728f)
                lineToRelative(-4.004f, 2.288f)
                close()
                moveTo(7.0f, 10.295f)
                verticalLineToRelative(3.428f)
                curveToRelative(0.0f, 0.709f, 0.38f, 1.364f, 0.996f, 1.716f)
                lineToRelative(3.004f, 1.717f)
                verticalLineToRelative(-4.576f)
                lineToRelative(-4.0f, -2.286f)
                close()
                moveTo(17.0f, 13.723f)
                verticalLineToRelative(-3.428f)
                lineToRelative(-4.0f, 2.286f)
                verticalLineToRelative(4.576f)
                lineToRelative(3.004f, -1.717f)
                curveToRelative(0.616f, -0.352f, 0.996f, -1.007f, 0.996f, -1.716f)
                close()
                moveTo(22.5f, 8.598f)
                verticalLineToRelative(6.805f)
                curveToRelative(0.0f, 1.61f, -0.869f, 3.107f, -2.268f, 3.907f)
                lineToRelative(-6.0f, 3.429f)
                curveToRelative(-0.688f, 0.393f, -1.461f, 0.589f, -2.232f, 0.589f)
                reflectiveCurveToRelative(-1.543f, -0.196f, -2.232f, -0.589f)
                lineToRelative(-6.0f, -3.429f)
                curveToRelative(-1.398f, -0.8f, -2.268f, -2.297f, -2.268f, -3.907f)
                verticalLineToRelative(-6.805f)
                curveToRelative(0.0f, -1.61f, 0.869f, -3.107f, 2.268f, -3.907f)
                lineToRelative(6.0f, -3.429f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.377f, -0.785f, 3.086f, -0.785f, 4.463f, 0.0f)
                lineToRelative(6.001f, 3.429f)
                curveToRelative(1.398f, 0.8f, 2.268f, 2.297f, 2.268f, 3.907f)
                close()
                moveTo(19.5f, 15.403f)
                verticalLineToRelative(-6.536f)
                lineToRelative(-2.5f, 1.428f)
                verticalLineToRelative(-0.017f)
                curveToRelative(0.0f, -0.709f, -0.38f, -1.364f, -0.996f, -1.716f)
                lineToRelative(2.477f, -1.415f)
                lineToRelative(-5.737f, -3.278f)
                curveToRelative(-0.459f, -0.262f, -1.03f, -0.262f, -1.489f, 0.0f)
                lineToRelative(-5.736f, 3.278f)
                lineToRelative(2.477f, 1.415f)
                curveToRelative(-0.616f, 0.352f, -0.996f, 1.007f, -0.996f, 1.716f)
                verticalLineToRelative(0.017f)
                lineToRelative(-2.5f, -1.428f)
                verticalLineToRelative(6.536f)
                curveToRelative(0.0f, 0.537f, 0.29f, 1.036f, 0.756f, 1.302f)
                lineToRelative(5.744f, 3.282f)
                verticalLineToRelative(-2.831f)
                lineToRelative(0.019f, 0.011f)
                curveToRelative(0.608f, 0.347f, 1.354f, 0.347f, 1.962f, 0.0f)
                lineToRelative(0.019f, -0.011f)
                verticalLineToRelative(2.831f)
                lineToRelative(5.744f, -3.283f)
                curveToRelative(0.466f, -0.266f, 0.756f, -0.765f, 0.756f, -1.302f)
                close()
            }
        }
        .build()
        return _modelCubeSpace!!
    }

private var _modelCubeSpace: ImageVector? = null
