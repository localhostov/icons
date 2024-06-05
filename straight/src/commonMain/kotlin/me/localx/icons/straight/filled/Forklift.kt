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

public val Icons.Filled.Forklift: ImageVector
    get() {
        if (_forklift != null) {
            return _forklift!!
        }
        _forklift = Builder(name = "Forklift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 21.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(3.0f, 24.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                lineTo(0.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(21.0f, 17.0f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-10.758f)
                lineToRelative(-0.638f, -2.271f)
                curveToRelative(-0.121f, -0.43f, -0.517f, -0.729f, -0.963f, -0.729f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.497f, -2.5f)
                horizontalLineToRelative(2.497f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(9.53f, 11.188f)
                lineToRelative(0.228f, 0.812f)
                horizontalLineToRelative(5.95f)
                lineToRelative(-1.906f, -9.589f)
                curveToRelative(-0.279f, -1.397f, -1.517f, -2.411f, -2.942f, -2.411f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.642f)
                curveToRelative(1.339f, 0.0f, 2.526f, 0.9f, 2.889f, 2.188f)
                close()
            }
        }
        .build()
        return _forklift!!
    }

private var _forklift: ImageVector? = null
