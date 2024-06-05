package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.AngleDoubleSmallLeft: ImageVector
    get() {
        if (_angleDoubleSmallLeft != null) {
            return _angleDoubleSmallLeft!!
        }
        _angleDoubleSmallLeft = Builder(name = "AngleDoubleSmallLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.189f, 6.707f)
                lineTo(9.775f, 5.293f)
                lineTo(4.482f, 10.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.828f)
                lineToRelative(5.293f, 5.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(5.9f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.189f, 6.707f)
                lineTo(16.775f, 5.293f)
                lineToRelative(-6.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(1.414f, -1.414f)
                lineTo(12.9f, 12.0f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallLeft!!
    }

private var _angleDoubleSmallLeft: ImageVector? = null
