package me.localx.icons.straight.outline

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

public val Icons.Outline.AngleDoubleRight: ImageVector
    get() {
        if (_angleDoubleRight != null) {
            return _angleDoubleRight!!
        }
        _angleDoubleRight = Builder(name = "AngleDoubleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.121f, 9.879f)
                lineTo(12.246f, 0.0f)
                lineTo(10.832f, 1.418f)
                lineToRelative(9.875f, 9.875f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineTo(10.819f, 22.6f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(9.888f, -9.888f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -4.242f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.535f, 11.293f)
                lineTo(2.262f, 0.019f)
                lineTo(0.847f, 1.433f)
                lineTo(11.414f, 12.0f)
                lineTo(0.836f, 22.578f)
                lineTo(2.25f, 23.993f)
                lineTo(13.535f, 12.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.535f, 11.293f)
                close()
            }
        }
        .build()
        return _angleDoubleRight!!
    }

private var _angleDoubleRight: ImageVector? = null
