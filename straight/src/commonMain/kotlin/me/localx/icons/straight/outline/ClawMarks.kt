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

public val Icons.Outline.ClawMarks: ImageVector
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
                reflectiveCurveToRelative(14.727f, 8.727f, 24.0f, 24.0f)
                curveTo(15.452f, 16.088f, 7.467f, 8.062f, 0.0f, 0.0f)
                close()
                moveTo(23.964f, 14.0f)
                curveTo(18.5f, 3.5f, 9.964f, 0.0f, 9.964f, 0.0f)
                curveToRelative(4.332f, 5.036f, 9.007f, 9.693f, 14.0f, 14.0f)
                close()
                moveTo(0.0f, 9.0f)
                curveToRelative(4.703f, 5.227f, 9.716f, 10.218f, 15.0f, 15.0f)
                curveTo(9.5f, 13.0f, 0.0f, 9.0f, 0.0f, 9.0f)
                close()
            }
        }
        .build()
        return _clawMarks!!
    }

private var _clawMarks: ImageVector? = null
