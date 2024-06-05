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

public val Icons.Filled.R: ImageVector
    get() {
        if (_r != null) {
            return _r!!
        }
        _r = Builder(name = "R", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.009f, 24.0f)
                lineToRelative(-5.329f, -9.325f)
                curveToRelative(3.075f, -0.936f, 5.32f, -3.797f, 5.32f, -7.175f)
                curveToRelative(0.0f, -4.136f, -3.364f, -7.5f, -7.5f, -7.5f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.5f)
                curveToRelative(0.02f, 0.0f, 0.04f, -0.003f, 0.061f, -0.003f)
                lineToRelative(5.145f, 9.003f)
                horizontalLineToRelative(2.303f)
                close()
                moveTo(4.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineTo(14.5f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.468f, 5.5f, -5.5f, 5.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _r!!
    }

private var _r: ImageVector? = null
