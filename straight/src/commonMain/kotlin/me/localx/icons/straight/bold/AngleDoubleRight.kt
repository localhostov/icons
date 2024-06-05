package me.localx.icons.straight.bold

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

public val Icons.Bold.AngleDoubleRight: ImageVector
    get() {
        if (_angleDoubleRight != null) {
            return _angleDoubleRight!!
        }
        _angleDoubleRight = Builder(name = "AngleDoubleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.33f, 9.533f)
                lineTo(12.8f, 0.005f)
                lineTo(10.68f, 2.126f)
                lineToRelative(9.529f, 9.528f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.0f, 0.692f)
                lineTo(10.68f, 21.874f)
                lineTo(12.8f, 24.0f)
                lineToRelative(9.529f, -9.528f)
                arcTo(3.493f, 3.493f, 0.0f, false, false, 22.33f, 9.533f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8f, 10.939f)
                lineTo(2.86f, 0.005f)
                lineTo(0.739f, 2.126f)
                lineTo(10.613f, 12.0f)
                lineTo(0.739f, 21.874f)
                lineTo(2.86f, 24.0f)
                lineTo(13.8f, 13.061f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.8f, 10.939f)
                close()
            }
        }
        .build()
        return _angleDoubleRight!!
    }

private var _angleDoubleRight: ImageVector? = null
