package me.localx.icons.straight.filled

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

public val Icons.Filled.ArrowRightToBracket: ImageVector
    get() {
        if (_arrowRightToBracket != null) {
            return _arrowRightToBracket!!
        }
        _arrowRightToBracket = Builder(name = "ArrowRightToBracket", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.41f, 13.41f)
                lineToRelative(-5.5f, 5.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.5f, -4.5f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(15.0f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(5.5f, 5.5f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _arrowRightToBracket!!
    }

private var _arrowRightToBracket: ImageVector? = null
