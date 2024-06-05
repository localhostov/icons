package me.localx.icons.straight.outline

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
                moveToRelative(21.0f, 18.0f)
                lineTo(21.0f, 3.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-3.093f)
                lineToRelative(-2.105f, -10.589f)
                curveToRelative(-0.279f, -1.397f, -1.517f, -2.411f, -2.942f, -2.411f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(17.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-0.696f, -3.5f)
                horizontalLineToRelative(2.696f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(7.86f)
                curveToRelative(0.475f, 0.0f, 0.888f, 0.338f, 0.981f, 0.804f)
                lineToRelative(2.039f, 10.196f)
                horizontalLineToRelative(-4.123f)
                lineToRelative(-0.228f, -0.812f)
                curveToRelative(-0.362f, -1.288f, -1.55f, -2.188f, -2.889f, -2.188f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 20.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(15.0f, 20.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(14.88f, 18.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.642f)
                curveToRelative(0.446f, 0.0f, 0.842f, 0.3f, 0.963f, 0.729f)
                lineToRelative(0.638f, 2.271f)
                horizontalLineToRelative(6.038f)
                lineToRelative(0.6f, 3.0f)
                close()
            }
        }
        .build()
        return _forklift!!
    }

private var _forklift: ImageVector? = null
