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

public val Icons.Filled.Turkey: ImageVector
    get() {
        if (_turkey != null) {
            return _turkey!!
        }
        _turkey = Builder(name = "Turkey", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.566f, 15.434f)
                arcToRelative(5.216f, 5.216f, 0.0f, false, true, 0.0f, -7.366f)
                curveToRelative(1.878f, -1.878f, 6.3f, -2.081f, 6.8f, -2.1f)
                lineToRelative(0.4f, -0.013f)
                lineToRelative(0.433f, 0.432f)
                lineToRelative(1.582f, -1.581f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.063f, -0.65f)
                arcTo(1.485f, 1.485f, 0.0f, false, true, 22.5f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.307f, 2.222f)
                lineTo(19.611f, 7.8f)
                lineToRelative(0.433f, 0.433f)
                lineToRelative(-0.014f, 0.4f)
                curveToRelative(-0.017f, 0.5f, -0.22f, 4.922f, -2.1f, 6.8f)
                arcToRelative(5.216f, 5.216f, 0.0f, false, true, -7.367f, 0.0f)
                close()
                moveTo(21.557f, 12.322f)
                arcToRelative(9.468f, 9.468f, 0.0f, false, true, -2.209f, 4.526f)
                arcTo(7.2f, 7.2f, 0.0f, false, true, 8.858f, 6.98f)
                arcTo(9.006f, 9.006f, 0.0f, false, false, 0.029f, 15.971f)
                verticalLineToRelative(6.847f)
                lineToRelative(0.835f, 0.14f)
                arcToRelative(82.083f, 82.083f, 0.0f, false, false, 8.165f, 1.013f)
                curveToRelative(5.6f, 0.0f, 15.0f, -0.779f, 15.0f, -6.0f)
                arcTo(8.843f, 8.843f, 0.0f, false, false, 21.557f, 12.322f)
                close()
                moveTo(9.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                close()
            }
        }
        .build()
        return _turkey!!
    }

private var _turkey: ImageVector? = null
