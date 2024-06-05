package me.localx.icons.straight.filled

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

public val Icons.Filled.ModelCubeArrows: ImageVector
    get() {
        if (_modelCubeArrows != null) {
            return _modelCubeArrows!!
        }
        _modelCubeArrows = Builder(name = "ModelCubeArrows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.859f, 9.779f)
                lineToRelative(-5.859f, 3.348f)
                lineToRelative(-5.859f, -3.348f)
                lineToRelative(4.859f, -2.777f)
                verticalLineToRelative(-2.925f)
                lineToRelative(-1.545f, 1.545f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.659f, -2.659f)
                curveToRelative(0.731f, -0.73f, 1.919f, -0.73f, 2.65f, 0.0f)
                lineToRelative(2.66f, 2.66f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.597f, -1.596f)
                verticalLineToRelative(2.976f)
                lineToRelative(4.859f, 2.777f)
                close()
                moveTo(5.0f, 17.158f)
                lineToRelative(-2.631f, 1.601f)
                lineToRelative(0.516f, -2.123f)
                lineToRelative(-1.943f, -0.473f)
                lineTo(0.054f, 19.817f)
                curveToRelative(-0.244f, 1.005f, 0.374f, 2.021f, 1.378f, 2.265f)
                lineToRelative(3.654f, 0.89f)
                lineToRelative(0.473f, -1.943f)
                lineToRelative(-2.194f, -0.534f)
                lineToRelative(2.526f, -1.537f)
                lineToRelative(5.109f, 2.919f)
                verticalLineToRelative(-7.019f)
                lineToRelative(-6.0f, -3.428f)
                verticalLineToRelative(5.728f)
                close()
                moveTo(23.946f, 19.817f)
                lineToRelative(-0.889f, -3.654f)
                lineToRelative(-1.943f, 0.473f)
                lineToRelative(0.516f, 2.123f)
                lineToRelative(-2.631f, -1.601f)
                verticalLineToRelative(-5.728f)
                lineToRelative(-6.0f, 3.428f)
                verticalLineToRelative(7.019f)
                lineToRelative(5.109f, -2.919f)
                lineToRelative(2.526f, 1.537f)
                lineToRelative(-2.194f, 0.534f)
                lineToRelative(0.473f, 1.943f)
                lineToRelative(3.654f, -0.89f)
                curveToRelative(1.004f, -0.244f, 1.622f, -1.26f, 1.378f, -2.265f)
                close()
            }
        }
        .build()
        return _modelCubeArrows!!
    }

private var _modelCubeArrows: ImageVector? = null
