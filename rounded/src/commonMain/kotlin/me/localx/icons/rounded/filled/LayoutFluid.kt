package me.localx.icons.rounded.filled

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

public val Icons.Filled.LayoutFluid: ImageVector
    get() {
        if (_layoutFluid != null) {
            return _layoutFluid!!
        }
        _layoutFluid = Builder(name = "LayoutFluid", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.667f, 234.667f)
                horizontalLineToRelative(234.667f)
                curveTo(300.897f, 234.667f, 320.0f, 215.564f, 320.0f, 192.0f)
                verticalLineTo(42.667f)
                curveTo(320.0f, 19.103f, 300.897f, 0.0f, 277.333f, 0.0f)
                horizontalLineTo(42.667f)
                curveTo(19.103f, 0.0f, 0.0f, 19.103f, 0.0f, 42.667f)
                verticalLineTo(192.0f)
                curveTo(0.0f, 215.564f, 19.103f, 234.667f, 42.667f, 234.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.704f, 18.816f)
                curveTo(496.775f, 7.054f, 483.518f, 0.002f, 469.333f, 0.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-23.564f, 0.0f, -42.667f, 19.103f, -42.667f, 42.667f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, 23.564f, 19.102f, 42.667f, 42.667f, 42.667f)
                horizontalLineToRelative(64.0f)
                curveTo(492.898f, 234.667f, 512.0f, 215.564f, 512.0f, 192.0f)
                verticalLineTo(42.667f)
                curveTo(512.014f, 34.165f, 509.472f, 25.855f, 504.704f, 18.816f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(130.517f, 284.629f)
                curveToRelative(-7.039f, -4.768f, -15.349f, -7.31f, -23.851f, -7.296f)
                horizontalLineToRelative(-64.0f)
                curveTo(19.103f, 277.333f, 0.0f, 296.436f, 0.0f, 320.0f)
                verticalLineToRelative(149.333f)
                curveTo(0.0f, 492.898f, 19.103f, 512.0f, 42.667f, 512.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(23.564f, 0.0f, 42.667f, -19.103f, 42.667f, -42.667f)
                verticalLineTo(320.0f)
                curveTo(149.331f, 305.815f, 142.279f, 292.559f, 130.517f, 284.629f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(493.184f, 284.629f)
                curveToRelative(-7.039f, -4.768f, -15.349f, -7.31f, -23.851f, -7.296f)
                horizontalLineTo(234.667f)
                curveTo(211.103f, 277.333f, 192.0f, 296.436f, 192.0f, 320.0f)
                verticalLineToRelative(149.333f)
                curveTo(192.0f, 492.898f, 211.103f, 512.0f, 234.667f, 512.0f)
                horizontalLineToRelative(234.667f)
                curveTo(492.898f, 512.0f, 512.0f, 492.898f, 512.0f, 469.333f)
                verticalLineTo(320.0f)
                curveTo(511.998f, 305.815f, 504.946f, 292.559f, 493.184f, 284.629f)
                close()
            }
        }
        .build()
        return _layoutFluid!!
    }

private var _layoutFluid: ImageVector? = null
