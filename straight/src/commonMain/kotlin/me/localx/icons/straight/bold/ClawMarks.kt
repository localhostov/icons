package me.localx.icons.straight.bold

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

public val Icons.Bold.ClawMarks: ImageVector
    get() {
        if (_clawMarks != null) {
            return _clawMarks!!
        }
        _clawMarks = Builder(name = "ClawMarks", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 0.0f)
                reflectiveCurveToRelative(17.5f, 6.0f, 24.0f, 24.0f)
                curveTo(15.452f, 16.088f, 7.467f, 8.062f, 0.0f, 0.0f)
                close()
                moveTo(24.0f, 13.577f)
                curveTo(20.798f, 2.205f, 9.964f, 0.0f, 9.964f, 0.0f)
                curveToRelative(4.343f, 4.884f, 9.03f, 9.4f, 14.036f, 13.577f)
                close()
                moveTo(0.0f, 9.0f)
                curveToRelative(4.703f, 5.228f, 9.716f, 10.218f, 15.0f, 15.0f)
                curveTo(11.115f, 11.615f, 0.0f, 9.0f, 0.0f, 9.0f)
                close()
            }
        }
        .build()
        return _clawMarks!!
    }

private var _clawMarks: ImageVector? = null
