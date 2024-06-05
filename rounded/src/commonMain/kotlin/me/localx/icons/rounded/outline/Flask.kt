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

public val Icons.Outline.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.929f, 9.891f)
                curveToRelative(-0.59f, -0.56f, -0.929f, -1.351f, -0.929f, -2.17f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(6.0f, 0.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.721f)
                curveToRelative(0.0f, 0.819f, -0.339f, 1.61f, -0.929f, 2.169f)
                curveTo(3.804f, 12.039f, 0.0f, 16.19f, 0.0f, 19.857f)
                curveToRelative(0.0f, 0.862f, 0.23f, 1.648f, 0.685f, 2.334f)
                curveToRelative(0.747f, 1.132f, 2.059f, 1.809f, 3.508f, 1.809f)
                horizontalLineToRelative(15.615f)
                curveToRelative(1.449f, 0.0f, 2.761f, -0.676f, 3.507f, -1.808f)
                curveToRelative(0.455f, -0.688f, 0.686f, -1.473f, 0.686f, -2.335f)
                curveToRelative(0.0f, -3.667f, -3.804f, -7.818f, -6.071f, -9.966f)
                close()
                moveTo(21.646f, 21.09f)
                curveToRelative(-0.37f, 0.562f, -1.074f, 0.91f, -1.838f, 0.91f)
                lineTo(4.192f, 22.0f)
                curveToRelative(-0.764f, 0.0f, -1.468f, -0.349f, -1.839f, -0.911f)
                curveToRelative(-0.238f, -0.359f, -0.354f, -0.763f, -0.354f, -1.232f)
                curveToRelative(0.0f, -0.901f, 0.337f, -1.882f, 0.854f, -2.857f)
                horizontalLineToRelative(14.146f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(4.144f, 15.0f)
                curveToRelative(1.149f, -1.537f, 2.492f, -2.89f, 3.302f, -3.658f)
                curveToRelative(0.987f, -0.936f, 1.554f, -2.255f, 1.554f, -3.621f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.721f)
                curveToRelative(0.0f, 1.366f, 0.566f, 2.686f, 1.554f, 3.622f)
                curveToRelative(1.638f, 1.552f, 5.446f, 5.488f, 5.446f, 8.515f)
                curveToRelative(0.0f, 0.469f, -0.115f, 0.873f, -0.354f, 1.233f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
