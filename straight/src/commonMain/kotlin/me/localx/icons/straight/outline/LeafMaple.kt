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

public val Icons.Outline.LeafMaple: ImageVector
    get() {
        if (_leafMaple != null) {
            return _leafMaple!!
        }
        _leafMaple = Builder(name = "LeafMaple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.038f, 14.009f)
                lineToRelative(-3.385f, -1.27f)
                lineToRelative(5.342f, -3.652f)
                lineToRelative(-2.833f, -2.411f)
                lineToRelative(1.919f, -5.757f)
                lineToRelative(-5.761f, 1.92f)
                lineTo(14.911f, 0.045f)
                lineToRelative(-3.648f, 5.307f)
                lineToRelative(-1.271f, -3.389f)
                lineToRelative(-3.362f, 2.262f)
                lineTo(4.0f, 0.003f)
                verticalLineToRelative(4.997f)
                lineTo(0.009f, 5.0f)
                lineToRelative(2.898f, 7.449f)
                lineToRelative(-1.887f, 3.774f)
                lineToRelative(4.46f, 0.892f)
                lineTo(0.021f, 22.575f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.453f, -5.453f)
                lineToRelative(0.889f, 4.444f)
                lineToRelative(3.775f, -1.888f)
                lineToRelative(7.448f, 2.876f)
                verticalLineToRelative(-3.968f)
                horizontalLineToRelative(4.952f)
                lineToRelative(-4.175f, -2.641f)
                lineToRelative(2.261f, -3.351f)
                close()
                moveTo(17.042f, 17.837f)
                lineToRelative(-0.042f, 3.215f)
                lineToRelative(-5.552f, -2.144f)
                lineToRelative(-2.224f, 1.112f)
                lineToRelative(-0.637f, -3.184f)
                lineToRelative(3.202f, -3.202f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.196f, 3.196f)
                lineToRelative(-3.199f, -0.64f)
                lineToRelative(1.113f, -2.226f)
                lineToRelative(-2.16f, -5.551f)
                lineToRelative(3.159f, -0.003f)
                lineToRelative(2.916f, -1.961f)
                lineToRelative(1.729f, 4.611f)
                lineToRelative(4.352f, -6.332f)
                lineToRelative(1.591f, 1.845f)
                lineToRelative(3.239f, -1.08f)
                lineToRelative(-1.081f, 3.243f)
                lineToRelative(1.867f, 1.589f)
                lineToRelative(-6.358f, 4.348f)
                lineToRelative(4.615f, 1.73f)
                lineToRelative(-1.92f, 2.845f)
                close()
            }
        }
        .build()
        return _leafMaple!!
    }

private var _leafMaple: ImageVector? = null
