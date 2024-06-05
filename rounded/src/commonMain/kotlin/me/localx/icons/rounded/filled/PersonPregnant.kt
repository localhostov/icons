package me.localx.icons.rounded.filled

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

public val Icons.Filled.PersonPregnant: ImageVector
    get() {
        if (_personPregnant != null) {
            return _personPregnant!!
        }
        _personPregnant = Builder(name = "PersonPregnant", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(14.818f, 9.488f)
                curveToRelative(-0.248f, -1.989f, -1.947f, -3.488f, -3.951f, -3.488f)
                reflectiveCurveToRelative(-3.703f, 1.5f, -3.951f, 3.488f)
                lineToRelative(-0.068f, 0.542f)
                lineToRelative(3.706f, 2.445f)
                curveToRelative(0.46f, 0.306f, 0.584f, 0.927f, 0.277f, 1.387f)
                curveToRelative(-0.192f, 0.289f, -0.51f, 0.445f, -0.833f, 0.445f)
                curveToRelative(-0.19f, 0.0f, -0.383f, -0.054f, -0.554f, -0.168f)
                lineToRelative(-2.874f, -1.89f)
                lineToRelative(-0.547f, 4.379f)
                curveToRelative(-0.106f, 0.854f, 0.158f, 1.712f, 0.728f, 2.357f)
                curveToRelative(0.34f, 0.385f, 0.775f, 0.658f, 1.249f, 0.826f)
                verticalLineToRelative(3.188f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.427f, 0.0f, 0.807f, -0.271f, 0.945f, -0.674f)
                curveToRelative(0.108f, -0.313f, 1.055f, -3.112f, 1.055f, -4.826f)
                curveToRelative(0.0f, -2.146f, -1.258f, -4.116f, -3.182f, -5.012f)
                close()
            }
        }
        .build()
        return _personPregnant!!
    }

private var _personPregnant: ImageVector? = null
