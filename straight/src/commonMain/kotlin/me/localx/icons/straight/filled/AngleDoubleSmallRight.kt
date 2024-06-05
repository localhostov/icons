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

public val Icons.Filled.AngleDoubleSmallRight: ImageVector
    get() {
        if (_angleDoubleSmallRight != null) {
            return _angleDoubleSmallRight!!
        }
        _angleDoubleSmallRight = Builder(name = "AngleDoubleSmallRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1f, 10.586f)
                lineTo(13.811f, 5.293f)
                lineTo(12.4f, 6.707f)
                lineTo(17.689f, 12.0f)
                lineTo(12.4f, 17.293f)
                lineToRelative(1.415f, 1.414f)
                lineTo(19.1f, 13.414f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.1f, 10.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.811f, 11.293f)
                lineToRelative(-6.0f, -6.0f)
                lineTo(5.4f, 6.707f)
                lineTo(10.689f, 12.0f)
                lineTo(5.4f, 17.293f)
                lineToRelative(1.415f, 1.414f)
                lineToRelative(6.0f, -6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.811f, 11.293f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallRight!!
    }

private var _angleDoubleSmallRight: ImageVector? = null
