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

public val Icons.Bold.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.667f, 96.0f)
                curveToRelative(0.0f, -17.673f, -14.327f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-80.555f)
                curveTo(364.632f, 25.757f, 328.549f, 0.13f, 288.0f, 0.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-40.549f, 0.13f, -76.632f, 25.757f, -90.112f, 64.0f)
                horizontalLineTo(53.333f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(64.0f)
                verticalLineToRelative(266.667f)
                curveTo(64.0f, 459.468f, 116.532f, 512.0f, 181.333f, 512.0f)
                horizontalLineToRelative(149.333f)
                curveTo(395.468f, 512.0f, 448.0f, 459.468f, 448.0f, 394.667f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(10.667f)
                curveTo(476.34f, 128.0f, 490.667f, 113.673f, 490.667f, 96.0f)
                close()
                moveTo(384.0f, 394.667f)
                curveTo(384.0f, 424.122f, 360.122f, 448.0f, 330.667f, 448.0f)
                horizontalLineTo(181.333f)
                curveTo(151.878f, 448.0f, 128.0f, 424.122f, 128.0f, 394.667f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(256.0f)
                verticalLineTo(394.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.667f, 384.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -17.673f, -14.327f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.327f, -32.0f, 32.0f)
                verticalLineToRelative(128.0f)
                curveTo(170.667f, 369.673f, 184.994f, 384.0f, 202.667f, 384.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(309.333f, 384.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -17.673f, -14.327f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.327f, -32.0f, 32.0f)
                verticalLineToRelative(128.0f)
                curveTo(277.333f, 369.673f, 291.66f, 384.0f, 309.333f, 384.0f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
