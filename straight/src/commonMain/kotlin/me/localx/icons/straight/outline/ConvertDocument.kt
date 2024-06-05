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

public val Icons.Outline.ConvertDocument: ImageVector
    get() {
        if (_convertDocument != null) {
            return _convertDocument!!
        }
        _convertDocument = Builder(name = "ConvertDocument", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.414f, 1.0f)
                horizontalLineToRelative(-7.414f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(17.0f)
                lineTo(24.0f, 7.586f)
                lineToRelative(-6.586f, -6.586f)
                close()
                moveTo(2.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 23.0f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 2.346f, 1.346f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(3.026f)
                curveToRelative(-0.442f, 0.584f, -0.773f, 1.257f, -0.924f, 2.0f)
                horizontalLineToRelative(-2.101f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(17.0f)
                close()
                moveTo(4.0f, 13.0f)
                horizontalLineToRelative(9.095f)
                lineToRelative(-1.802f, -1.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.799f, 2.801f)
                curveToRelative(0.774f, 0.775f, 0.774f, 2.037f, 0.0f, 2.812f)
                lineToRelative(-2.8f, 2.802f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.792f, -1.793f)
                lineTo(4.0f, 15.001f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _convertDocument!!
    }

private var _convertDocument: ImageVector? = null
