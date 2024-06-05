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

public val Icons.Outline.MartiniGlassEmpty: ImageVector
    get() {
        if (_martiniGlassEmpty != null) {
            return _martiniGlassEmpty!!
        }
        _martiniGlassEmpty = Builder(name = "MartiniGlassEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 0.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.553f, 0.659f, 3.042f, 1.808f, 4.086f)
                lineToRelative(9.192f, 8.357f)
                verticalLineToRelative(8.557f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-8.557f)
                lineToRelative(9.192f, -8.357f)
                curveToRelative(1.149f, -1.044f, 1.808f, -2.533f, 1.808f, -4.086f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(20.847f, 3.605f)
                lineToRelative(-8.847f, 8.043f)
                lineTo(3.153f, 3.605f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.48f, -0.436f, -0.826f, -0.994f, -1.007f, -1.605f)
                horizontalLineToRelative(19.709f)
                curveToRelative(-0.181f, 0.611f, -0.527f, 1.17f, -1.007f, 1.605f)
                close()
            }
        }
        .build()
        return _martiniGlassEmpty!!
    }

private var _martiniGlassEmpty: ImageVector? = null
