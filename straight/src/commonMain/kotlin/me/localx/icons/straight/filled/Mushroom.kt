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

public val Icons.Filled.Mushroom: ImageVector
    get() {
        if (_mushroom != null) {
            return _mushroom!!
        }
        _mushroom = Builder(name = "Mushroom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.771f, 15.057f)
                lineToRelative(-0.368f, -0.272f)
                arcTo(15.866f, 15.866f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(15.866f, 15.866f, 0.0f, false, false, -8.4f, 2.785f)
                lineToRelative(-0.367f, 0.271f)
                lineToRelative(-0.445f, -0.1f)
                arcTo(3.642f, 3.642f, 0.0f, false, true, 0.0f, 11.33f)
                curveTo(0.0f, 5.083f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(24.0f, 5.083f, 24.0f, 11.33f)
                arcToRelative(3.642f, 3.642f, 0.0f, false, true, -2.785f, 3.629f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(11.849f, 11.849f, 0.0f, false, false, -4.113f, 0.8f)
                arcTo(28.589f, 28.589f, 0.0f, false, false, 7.0f, 19.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                arcToRelative(31.75f, 31.75f, 0.0f, false, false, -0.923f, -4.209f)
                arcTo(11.815f, 11.815f, 0.0f, false, false, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
