package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.LayoutFluid: ImageVector
    get() {
        if (_layoutFluid != null) {
            return _layoutFluid!!
        }
        _layoutFluid = Builder(name = "LayoutFluid", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.667f, 0.0f)
                horizontalLineToRelative(234.667f)
                curveTo(300.897f, 0.0f, 320.0f, 19.103f, 320.0f, 42.667f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, 23.564f, -19.103f, 42.667f, -42.667f, 42.667f)
                horizontalLineTo(42.667f)
                curveTo(19.103f, 234.667f, 0.0f, 215.564f, 0.0f, 192.0f)
                verticalLineTo(42.667f)
                curveTo(0.0f, 19.103f, 19.103f, 0.0f, 42.667f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(405.333f, 0.0f)
                horizontalLineToRelative(64.0f)
                curveTo(492.898f, 0.0f, 512.0f, 19.103f, 512.0f, 42.667f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, 23.564f, -19.102f, 42.667f, -42.667f, 42.667f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-23.564f, 0.0f, -42.667f, -19.103f, -42.667f, -42.667f)
                verticalLineTo(42.667f)
                curveTo(362.667f, 19.103f, 381.769f, 0.0f, 405.333f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.667f, 277.333f)
                horizontalLineToRelative(64.0f)
                curveToRelative(23.564f, 0.0f, 42.667f, 19.103f, 42.667f, 42.667f)
                verticalLineToRelative(149.333f)
                curveToRelative(0.0f, 23.564f, -19.103f, 42.667f, -42.667f, 42.667f)
                horizontalLineToRelative(-64.0f)
                curveTo(19.103f, 512.0f, 0.0f, 492.898f, 0.0f, 469.333f)
                verticalLineTo(320.0f)
                curveTo(0.0f, 296.436f, 19.103f, 277.333f, 42.667f, 277.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.667f, 277.333f)
                horizontalLineToRelative(234.667f)
                curveTo(492.898f, 277.333f, 512.0f, 296.436f, 512.0f, 320.0f)
                verticalLineToRelative(149.333f)
                curveTo(512.0f, 492.898f, 492.898f, 512.0f, 469.333f, 512.0f)
                horizontalLineTo(234.667f)
                curveTo(211.103f, 512.0f, 192.0f, 492.898f, 192.0f, 469.333f)
                verticalLineTo(320.0f)
                curveTo(192.0f, 296.436f, 211.103f, 277.333f, 234.667f, 277.333f)
                close()
            }
        }
        .build()
        return _layoutFluid!!
    }

private var _layoutFluid: ImageVector? = null
