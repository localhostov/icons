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

public val Icons.Outline.Forklift: ImageVector
    get() {
        if (_forklift != null) {
            return _forklift!!
        }
        _forklift = Builder(name = "Forklift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 18.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                lineTo(21.0f, 4.5f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-3.08f)
                lineToRelative(-1.796f, -8.98f)
                curveToRelative(-0.466f, -2.329f, -2.528f, -4.02f, -4.903f, -4.02f)
                horizontalLineToRelative(-4.221f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.065f, -0.006f, -0.132f, -0.02f, -0.196f)
                lineToRelative(-0.661f, -3.304f)
                horizontalLineToRelative(2.68f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(4.221f)
                curveToRelative(1.425f, 0.0f, 2.662f, 1.015f, 2.942f, 2.412f)
                lineToRelative(1.718f, 8.588f)
                horizontalLineToRelative(-3.28f)
                curveToRelative(-0.496f, 0.0f, -0.937f, -0.334f, -1.07f, -0.812f)
                curveToRelative(-0.362f, -1.288f, -1.55f, -2.188f, -2.889f, -2.188f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(5.0f, 20.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(13.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(14.88f, 18.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.642f)
                curveToRelative(0.446f, 0.0f, 0.842f, 0.3f, 0.963f, 0.729f)
                curveToRelative(0.375f, 1.337f, 1.607f, 2.271f, 2.996f, 2.271f)
                horizontalLineToRelative(3.68f)
                lineToRelative(0.6f, 3.0f)
                close()
            }
        }
        .build()
        return _forklift!!
    }

private var _forklift: ImageVector? = null
