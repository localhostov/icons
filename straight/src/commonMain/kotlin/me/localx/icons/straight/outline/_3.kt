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

public val Icons.Outline._3: ImageVector
    get() {
        if (__3 != null) {
            return __3!!
        }
        __3 = Builder(name = "_3", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.893f, 9.82f)
                curveToRelative(1.281f, -1.008f, 2.107f, -2.568f, 2.107f, -4.32f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.468f, 5.5f, -5.5f, 5.5f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(12.5f)
                curveToRelative(4.136f, 0.0f, 7.5f, -3.364f, 7.5f, -7.5f)
                curveToRelative(0.0f, -2.914f, -1.674f, -5.439f, -4.107f, -6.68f)
                close()
            }
        }
        .build()
        return __3!!
    }

private var __3: ImageVector? = null
