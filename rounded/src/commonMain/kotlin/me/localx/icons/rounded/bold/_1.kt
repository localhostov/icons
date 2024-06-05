package me.localx.icons.rounded.bold

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

public val Icons.Bold._1: ImageVector
    get() {
        if (__1 != null) {
            return __1!!
        }
        __1 = Builder(name = "_1", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 24.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineTo(3.952f)
                lineToRelative(-4.322f, 5.477f)
                curveToRelative(-0.514f, 0.65f, -1.456f, 0.761f, -2.107f, 0.249f)
                curveToRelative(-0.65f, -0.514f, -0.762f, -1.457f, -0.249f, -2.107f)
                curveToRelative(0.0f, 0.0f, 5.369f, -6.797f, 5.41f, -6.838f)
                curveTo(11.451f, 0.015f, 12.52f, -0.197f, 13.457f, 0.19f)
                curveToRelative(0.937f, 0.388f, 1.543f, 1.295f, 1.543f, 2.31f)
                verticalLineTo(22.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return __1!!
    }

private var __1: ImageVector? = null
