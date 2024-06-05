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

public val Icons.Outline.SirenOn: ImageVector
    get() {
        if (_sirenOn != null) {
            return _sirenOn!!
        }
        _sirenOn = Builder(name = "SirenOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.0f)
                horizontalLineToRelative(-0.031f)
                lineToRelative(-1.148f, -8.496f)
                curveToRelative(-0.25f, -1.998f, -1.957f, -3.504f, -3.969f, -3.504f)
                horizontalLineToRelative(-7.703f)
                curveToRelative(-2.013f, 0.0f, -3.719f, 1.506f, -3.968f, 3.494f)
                lineToRelative(-1.149f, 8.506f)
                horizontalLineToRelative(-0.031f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(6.164f, 9.752f)
                curveToRelative(0.125f, -0.999f, 0.979f, -1.752f, 1.985f, -1.752f)
                horizontalLineToRelative(7.703f)
                curveToRelative(1.006f, 0.0f, 1.86f, 0.753f, 1.986f, 1.762f)
                lineToRelative(1.113f, 8.238f)
                lineTo(5.05f, 18.0f)
                lineToRelative(1.114f, -8.248f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(8.148f, 10.0f)
                horizontalLineToRelative(3.852f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.104f)
                lineToRelative(-0.27f, 2.0f)
                horizontalLineToRelative(-2.018f)
                lineToRelative(0.54f, -4.0f)
                close()
                moveTo(3.136f, 6.317f)
                lineTo(0.389f, 3.687f)
                lineToRelative(1.384f, -1.444f)
                lineToRelative(2.747f, 2.631f)
                lineToRelative(-1.384f, 1.444f)
                close()
                moveTo(6.453f, 4.125f)
                lineToRelative(-0.538f, -3.792f)
                lineTo(7.896f, 0.052f)
                lineToRelative(0.538f, 3.792f)
                lineToRelative(-1.98f, 0.281f)
                close()
                moveTo(17.546f, 4.125f)
                lineToRelative(-1.98f, -0.281f)
                lineTo(16.104f, 0.052f)
                lineToRelative(1.98f, 0.281f)
                lineToRelative(-0.538f, 3.792f)
                close()
                moveTo(20.863f, 6.317f)
                lineToRelative(-1.384f, -1.444f)
                lineToRelative(2.747f, -2.631f)
                lineToRelative(1.384f, 1.444f)
                lineToRelative(-2.747f, 2.631f)
                close()
            }
        }
        .build()
        return _sirenOn!!
    }

private var _sirenOn: ImageVector? = null
