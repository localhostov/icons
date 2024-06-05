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

public val Icons.Filled.RubleSign: ImageVector
    get() {
        if (_rubleSign != null) {
            return _rubleSign!!
        }
        _rubleSign = Builder(name = "RubleSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 15.0f)
                curveToRelative(4.136f, 0.0f, 7.5f, -3.364f, 7.5f, -7.5f)
                reflectiveCurveTo(18.636f, 0.0f, 14.5f, 0.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(7.0f, 2.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.467f, 5.5f, -5.5f, 5.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _rubleSign!!
    }

private var _rubleSign: ImageVector? = null
