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

public val Icons.Filled.LeafMaple: ImageVector
    get() {
        if (_leafMaple != null) {
            return _leafMaple!!
        }
        _leafMaple = Builder(name = "LeafMaple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.777f, 17.359f)
                lineToRelative(4.175f, 2.641f)
                horizontalLineToRelative(-4.952f)
                verticalLineToRelative(3.968f)
                lineToRelative(-7.448f, -2.876f)
                lineToRelative(-3.775f, 1.888f)
                lineToRelative(-0.889f, -4.444f)
                lineToRelative(4.901f, -4.901f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-4.895f, 4.895f)
                lineToRelative(-4.46f, -0.892f)
                lineToRelative(1.887f, -3.774f)
                lineTo(0.009f, 5.0f)
                horizontalLineToRelative(3.991f)
                lineTo(4.0f, 0.003f)
                lineToRelative(2.63f, 4.223f)
                lineToRelative(3.362f, -2.262f)
                lineToRelative(1.271f, 3.389f)
                lineTo(14.911f, 0.045f)
                lineToRelative(2.409f, 2.794f)
                lineToRelative(5.761f, -1.92f)
                lineToRelative(-1.919f, 5.757f)
                lineToRelative(2.833f, 2.411f)
                lineToRelative(-5.342f, 3.652f)
                lineToRelative(3.385f, 1.27f)
                lineToRelative(-2.261f, 3.351f)
                close()
                moveTo(5.48f, 17.115f)
                lineTo(0.021f, 22.575f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.453f, -5.453f)
                lineToRelative(-1.408f, -1.42f)
                close()
            }
        }
        .build()
        return _leafMaple!!
    }

private var _leafMaple: ImageVector? = null
