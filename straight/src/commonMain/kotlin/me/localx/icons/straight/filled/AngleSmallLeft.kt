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

public val Icons.Filled.AngleSmallLeft: ImageVector
    get() {
        if (_angleSmallLeft != null) {
            return _angleSmallLeft!!
        }
        _angleSmallLeft = Builder(name = "AngleSmallLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.775f, 18.707f)
                lineTo(8.482f, 13.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineToRelative(5.293f, -5.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(9.9f, 12.0f)
                lineToRelative(5.293f, 5.293f)
                close()
            }
        }
        .build()
        return _angleSmallLeft!!
    }

private var _angleSmallLeft: ImageVector? = null
