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

public val Icons.Outline.AngleDoubleSmallRight: ImageVector
    get() {
        if (_angleDoubleSmallRight != null) {
            return _angleDoubleSmallRight!!
        }
        _angleDoubleSmallRight = Builder(name = "AngleDoubleSmallRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.7f, -1.71f)
                lineTo(17.0f, 12.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineTo(12.4f, 6.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                lineTo(18.4f, 9.88f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 4.24f)
                lineToRelative(-4.59f, 4.59f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.1f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.7f, -1.71f)
                lineTo(10.69f, 12.0f)
                lineTo(5.4f, 6.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                lineToRelative(6.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                lineToRelative(-6.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.1f, 19.0f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallRight!!
    }

private var _angleDoubleSmallRight: ImageVector? = null
