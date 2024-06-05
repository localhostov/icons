package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveTo(12.0f, 4.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, -8.0f, 8.0f)
                curveToRelative(0.376f, 10.588f, 15.626f, 10.585f, 16.0f, 0.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, false, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(4.071f, 17.748f, 4.072f, 6.251f, 12.0f, 6.0f)
                curveTo(19.929f, 6.252f, 19.928f, 17.749f, 12.0f, 18.0f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 9.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(12.026f, 12.026f, 0.0f, false, true, -2.743f, 7.637f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.543f, -1.274f)
                arcToRelative(10.052f, 10.052f, 0.0f, false, false, 0.0f, -12.726f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.543f, -1.274f)
                arcTo(12.026f, 12.026f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(4.286f, 18.363f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.542f, 1.274f)
                arcToRelative(12.065f, 12.065f, 0.0f, false, true, 0.0f, -15.274f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.286f, 5.637f)
                arcTo(10.052f, 10.052f, 0.0f, false, false, 4.286f, 18.363f)
                close()
                moveTo(13.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 15.0f)
                close()
            }
        }
        .build()
        return _engineWarning!!
    }

private var _engineWarning: ImageVector? = null
