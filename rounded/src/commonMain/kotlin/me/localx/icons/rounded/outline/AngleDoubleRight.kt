package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

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
                moveTo(11.83f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.71f, -0.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.42f)
                lineToRelative(8.17f, -8.17f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -4.24f)
                lineTo(11.12f, 1.71f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 12.54f, 0.29f)
                lineToRelative(8.17f, 8.17f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 7.08f)
                lineToRelative(-8.17f, 8.17f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.83f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.83f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.71f, -0.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.42f)
                lineToRelative(9.59f, -9.58f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineTo(1.12f, 1.71f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.54f, 0.29f)
                lineToRelative(9.58f, 9.59f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 4.24f)
                lineTo(2.54f, 23.71f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.83f, 24.0f)
                close()
            }
        }
        .build()
        return _angleDoubleRight!!
    }

private var _angleDoubleRight: ImageVector? = null
