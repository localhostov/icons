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

public val Icons.Filled.TextSlash: ImageVector
    get() {
        if (_textSlash != null) {
            return _textSlash!!
        }
        _textSlash = Builder(name = "TextSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 22.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -4.757f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(0.0f, 6.757f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 10.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(0.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.581f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(6.364f)
                curveToRelative(0.351f, 0.0f, 0.636f, 0.286f, 0.636f, 0.636f)
                verticalLineToRelative(4.364f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 5.636f)
                curveToRelative(0.0f, -1.454f, -1.183f, -2.636f, -2.636f, -2.636f)
                lineTo(4.636f, 3.0f)
                curveToRelative(-0.066f, 0.0f, -0.13f, 0.016f, -0.196f, 0.021f)
                lineTo(1.419f, 0.0f)
                lineTo(0.0f, 1.419f)
                lineTo(22.581f, 24.0f)
                lineToRelative(1.419f, -1.419f)
                lineTo(13.0f, 11.581f)
                close()
                moveTo(11.0f, 5.0f)
                verticalLineToRelative(4.581f)
                lineTo(6.419f, 5.0f)
                horizontalLineToRelative(4.581f)
                close()
            }
        }
        .build()
        return _textSlash!!
    }

private var _textSlash: ImageVector? = null
