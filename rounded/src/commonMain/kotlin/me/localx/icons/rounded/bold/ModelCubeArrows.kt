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
                moveToRelative(23.969f, 20.311f)
                lineToRelative(-0.965f, -3.329f)
                curveToRelative(-0.192f, -0.663f, -1.09f, -0.762f, -1.423f, -0.158f)
                lineToRelative(-0.521f, 0.947f)
                lineToRelative(-2.06f, -1.092f)
                verticalLineToRelative(-4.223f)
                curveToRelative(0.0f, -1.252f, -0.676f, -2.416f, -1.764f, -3.039f)
                lineToRelative(-3.736f, -2.135f)
                verticalLineToRelative(-2.283f)
                horizontalLineToRelative(0.951f)
                curveToRelative(0.69f, 0.0f, 1.036f, -0.834f, 0.548f, -1.323f)
                lineToRelative(-2.451f, -2.451f)
                curveToRelative(-0.303f, -0.302f, -0.793f, -0.302f, -1.096f, 0.0f)
                lineToRelative(-2.451f, 2.451f)
                curveToRelative(-0.488f, 0.488f, -0.142f, 1.323f, 0.548f, 1.323f)
                horizontalLineToRelative(0.951f)
                verticalLineToRelative(2.283f)
                lineToRelative(-3.737f, 2.136f)
                curveToRelative(-1.087f, 0.622f, -1.763f, 1.786f, -1.763f, 3.038f)
                verticalLineToRelative(4.223f)
                lineToRelative(-2.06f, 1.092f)
                lineToRelative(-0.521f, -0.947f)
                curveToRelative(-0.333f, -0.605f, -1.231f, -0.505f, -1.423f, 0.158f)
                lineTo(0.031f, 20.311f)
                curveToRelative(-0.119f, 0.411f, 0.117f, 0.841f, 0.528f, 0.96f)
                lineToRelative(3.329f, 0.965f)
                curveToRelative(0.663f, 0.192f, 1.227f, -0.513f, 0.894f, -1.118f)
                lineToRelative(-0.396f, -0.719f)
                lineToRelative(2.086f, -1.106f)
                lineToRelative(3.791f, 2.167f)
                curveToRelative(0.535f, 0.306f, 1.136f, 0.459f, 1.736f, 0.459f)
                reflectiveCurveToRelative(1.201f, -0.153f, 1.736f, -0.459f)
                lineToRelative(3.791f, -2.167f)
                lineToRelative(2.086f, 1.106f)
                lineToRelative(-0.396f, 0.719f)
                curveToRelative(-0.333f, 0.605f, 0.232f, 1.31f, 0.894f, 1.118f)
                lineToRelative(3.329f, -0.965f)
                curveToRelative(0.411f, -0.119f, 0.647f, -0.549f, 0.528f, -0.96f)
                close()
                moveTo(12.0f, 9.881f)
                lineToRelative(2.852f, 1.63f)
                lineToRelative(-2.852f, 1.631f)
                lineToRelative(-2.852f, -1.631f)
                lineToRelative(2.852f, -1.63f)
                close()
                moveTo(11.0f, 18.426f)
                lineToRelative(-3.0f, -1.714f)
                verticalLineToRelative(-3.554f)
                lineToRelative(3.0f, 1.714f)
                verticalLineToRelative(3.554f)
                close()
                moveTo(16.0f, 16.712f)
                lineToRelative(-3.0f, 1.714f)
                verticalLineToRelative(-3.554f)
                lineToRelative(3.0f, -1.714f)
                verticalLineToRelative(3.554f)
                close()
            }
        }
        .build()
        return _modelCubeArrows!!
    }

private var _modelCubeArrows: ImageVector? = null
