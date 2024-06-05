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

public val Icons.Filled.Frown: ImageVector
    get() {
        if (_frown != null) {
            return _frown!!
        }
        _frown = Builder(name = "Frown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(6.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(17.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                curveToRelative(0.0f, -2.0f, 2.028f, -5.0f, 5.007f, -5.0f)
                arcTo(5.307f, 5.307f, 0.0f, false, true, 17.0f, 18.0f)
                close()
                moveTo(14.0f, 11.0f)
                lineTo(14.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _frown!!
    }

private var _frown: ImageVector? = null
