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

public val Icons.Bold.ModelCubeArrows: ImageVector
    get() {
        if (_modelCubeArrows != null) {
            return _modelCubeArrows!!
        }
        _modelCubeArrows = Builder(name = "ModelCubeArrows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.931f, 20.21f)
                lineToRelative(-1.679f, -4.647f)
                lineToRelative(-1.202f, 2.191f)
                lineToRelative(-2.051f, -1.125f)
                verticalLineToRelative(-6.202f)
                lineToRelative(-5.5f, -3.144f)
                verticalLineToRelative(-2.283f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-3.267f, -3.707f)
                curveToRelative(-0.405f, -0.391f, -1.062f, -0.391f, -1.467f, 0.0f)
                lineToRelative(-3.267f, 3.707f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.283f)
                lineToRelative(-5.5f, 3.144f)
                verticalLineToRelative(6.202f)
                lineToRelative(-2.051f, 1.125f)
                lineToRelative(-1.202f, -2.191f)
                lineTo(0.069f, 20.21f)
                curveToRelative(-0.148f, 0.543f, 0.168f, 1.119f, 0.705f, 1.286f)
                lineToRelative(4.821f, 1.081f)
                lineToRelative(-1.203f, -2.192f)
                lineToRelative(2.035f, -1.117f)
                lineToRelative(5.572f, 3.185f)
                lineToRelative(5.572f, -3.185f)
                lineToRelative(2.035f, 1.117f)
                lineToRelative(-1.203f, 2.192f)
                lineToRelative(4.821f, -1.081f)
                curveToRelative(0.537f, -0.167f, 0.853f, -0.743f, 0.705f, -1.286f)
                close()
                moveTo(12.0f, 13.14f)
                lineToRelative(-2.852f, -1.63f)
                lineToRelative(2.852f, -1.63f)
                lineToRelative(2.852f, 1.63f)
                lineToRelative(-2.852f, 1.63f)
                close()
                moveTo(8.0f, 13.157f)
                lineToRelative(3.0f, 1.714f)
                verticalLineToRelative(3.555f)
                lineToRelative(-3.0f, -1.715f)
                verticalLineToRelative(-3.554f)
                close()
                moveTo(13.0f, 18.425f)
                verticalLineToRelative(-3.555f)
                lineToRelative(3.0f, -1.714f)
                verticalLineToRelative(3.554f)
                lineToRelative(-3.0f, 1.715f)
                close()
            }
        }
        .build()
        return _modelCubeArrows!!
    }

private var _modelCubeArrows: ImageVector? = null
