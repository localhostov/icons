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
        _angleDoubleSmallLeft = Builder(name = "AngleDoubleSmallLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1892f, 6.707f)
                lineTo(9.7752f, 5.293f)
                lineTo(4.4822f, 10.586f)
                curveTo(4.1073f, 10.961f, 3.8967f, 11.4696f, 3.8967f, 12.0f)
                curveTo(3.8967f, 12.5303f, 4.1073f, 13.0389f, 4.4822f, 13.414f)
                lineTo(9.7752f, 18.707f)
                lineTo(11.1892f, 17.293f)
                lineTo(5.9002f, 12.0f)
                lineTo(11.1892f, 6.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1889f, 6.707f)
                lineTo(16.775f, 5.293f)
                lineTo(10.775f, 11.293f)
                curveTo(10.5875f, 11.4805f, 10.4822f, 11.7348f, 10.4822f, 12.0f)
                curveTo(10.4822f, 12.2651f, 10.5875f, 12.5194f, 10.775f, 12.707f)
                lineTo(16.775f, 18.707f)
                lineTo(18.1889f, 17.293f)
                lineTo(12.9f, 12.0f)
                lineTo(18.1889f, 6.707f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallLeft!!
    }

private var _angleDoubleSmallLeft: ImageVector? = null
