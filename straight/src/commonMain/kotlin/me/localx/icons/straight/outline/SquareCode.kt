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

public val Icons.Outline.SquareCode: ImageVector
    get() {
        if (_squareCode != null) {
            return _squareCode!!
        }
        _squareCode = Builder(name = "SquareCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.119f, 16.705f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.299f, -3.299f)
                lineToRelative(-3.299f, -3.283f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.299f, 3.298f)
                curveToRelative(0.376f, 0.375f, 0.583f, 0.875f, 0.583f, 1.406f)
                reflectiveCurveToRelative(-0.207f, 1.031f, -0.583f, 1.407f)
                lineToRelative(-3.299f, 3.298f)
                close()
                moveTo(10.295f, 15.291f)
                lineToRelative(-3.299f, -3.283f)
                lineToRelative(3.299f, -3.298f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.299f, 3.298f)
                curveToRelative(-0.376f, 0.375f, -0.583f, 0.875f, -0.583f, 1.407f)
                reflectiveCurveToRelative(0.207f, 1.031f, 0.583f, 1.406f)
                lineToRelative(3.299f, 3.299f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                close()
                moveTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                lineTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                close()
            }
        }
        .build()
        return _squareCode!!
    }

private var _squareCode: ImageVector? = null
