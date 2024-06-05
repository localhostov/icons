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

public val Icons.Outline.RotateExclamation: ImageVector
    get() {
        if (_rotateExclamation != null) {
            return _rotateExclamation!!
        }
        _rotateExclamation = Builder(name = "RotateExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(2.98f, 0.0f, 5.822f, 1.11f, 8.0f, 3.057f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.141f)
                curveToRelative(-1.866f, -1.901f, -4.435f, -3.0f, -7.141f, -3.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-2.706f, 0.0f, -5.275f, -1.099f, -7.141f, -3.0f)
                horizontalLineToRelative(4.141f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.057f)
                curveToRelative(2.178f, 1.946f, 5.02f, 3.057f, 8.0f, 3.057f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 5.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _rotateExclamation!!
    }

private var _rotateExclamation: ImageVector? = null
