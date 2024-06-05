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

public val Icons.Outline.Lambda: ImageVector
    get() {
        if (_lambda != null) {
            return _lambda!!
        }
        _lambda = Builder(name = "Lambda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.264f)
                curveToRelative(-1.144f, 0.0f, -2.172f, -0.636f, -2.684f, -1.658f)
                lineToRelative(-6.591f, -13.182f)
                lineToRelative(-7.709f, 14.84f)
                horizontalLineTo(1.5f)
                lineTo(10.353f, 6.942f)
                lineToRelative(-2.195f, -4.389f)
                curveToRelative(-0.17f, -0.341f, -0.513f, -0.553f, -0.895f, -0.553f)
                horizontalLineToRelative(-3.264f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.264f)
                curveToRelative(1.144f, 0.0f, 2.172f, 0.636f, 2.684f, 1.658f)
                lineToRelative(9.895f, 19.789f)
                curveToRelative(0.17f, 0.341f, 0.513f, 0.553f, 0.895f, 0.553f)
                horizontalLineToRelative(3.264f)
                close()
            }
        }
        .build()
        return _lambda!!
    }

private var _lambda: ImageVector? = null
