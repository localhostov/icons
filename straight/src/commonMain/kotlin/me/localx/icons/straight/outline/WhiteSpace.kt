package me.localx.icons.straight.outline

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

public val Icons.Outline.WhiteSpace: ImageVector
    get() {
        if (_whiteSpace != null) {
            return _whiteSpace!!
        }
        _whiteSpace = Builder(name = "WhiteSpace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(12.002f)
                curveToRelative(-0.006f, 0.504f, -0.199f, 1.007f, -0.583f, 1.391f)
                lineToRelative(-3.535f, 3.535f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.515f, -2.515f)
                horizontalLineTo(5.018f)
                lineToRelative(2.515f, 2.515f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.535f, -3.535f)
                curveToRelative(-0.384f, -0.384f, -0.577f, -0.887f, -0.583f, -1.391f)
                verticalLineToRelative(11.998f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.957f)
                curveToRelative(0.006f, -0.504f, 0.199f, -1.007f, 0.583f, -1.391f)
                lineToRelative(3.535f, -3.536f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.556f, 2.557f)
                horizontalLineToRelative(14.047f)
                lineToRelative(-2.556f, -2.557f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.535f, 3.536f)
                curveToRelative(0.384f, 0.384f, 0.577f, 0.887f, 0.583f, 1.391f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _whiteSpace!!
    }

private var _whiteSpace: ImageVector? = null
