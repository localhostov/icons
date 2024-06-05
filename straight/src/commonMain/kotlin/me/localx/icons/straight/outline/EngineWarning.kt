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

public val Icons.Outline.EngineWarning: ImageVector
    get() {
        if (_engineWarning != null) {
            return _engineWarning!!
        }
        _engineWarning = Builder(name = "EngineWarning", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, -8.0f)
                curveTo(4.376f, 1.412f, 19.626f, 1.415f, 20.0f, 12.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-7.929f, 0.252f, -7.928f, 11.749f, 0.0f, 12.0f)
                curveTo(19.929f, 17.748f, 19.928f, 6.251f, 12.0f, 6.0f)
                close()
                moveTo(13.0f, 8.0f)
                lineTo(11.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 14.0f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(12.026f, 12.026f, 0.0f, false, false, -2.743f, -7.637f)
                lineTo(19.714f, 5.637f)
                arcToRelative(10.052f, 10.052f, 0.0f, false, true, 0.0f, 12.726f)
                lineToRelative(1.543f, 1.274f)
                arcTo(12.026f, 12.026f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(4.286f, 18.363f)
                arcToRelative(10.052f, 10.052f, 0.0f, false, true, 0.0f, -12.726f)
                lineTo(2.744f, 4.363f)
                arcToRelative(12.065f, 12.065f, 0.0f, false, false, 0.0f, 15.274f)
                close()
            }
        }
        .build()
        return _engineWarning!!
    }

private var _engineWarning: ImageVector? = null
