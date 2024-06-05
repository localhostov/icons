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

public val Icons.Filled.Siren: ImageVector
    get() {
        if (_siren != null) {
            return _siren!!
        }
        _siren = Builder(name = "Siren", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(21.216f, 18.0f)
                lineToRelative(-1.395f, -14.496f)
                curveToRelative(-0.25f, -1.998f, -1.957f, -3.504f, -3.969f, -3.504f)
                horizontalLineToRelative(-7.703f)
                curveToRelative(-2.013f, 0.0f, -3.719f, 1.506f, -3.973f, 3.532f)
                lineToRelative(-1.392f, 14.468f)
                horizontalLineToRelative(18.433f)
                close()
                moveTo(8.149f, 4.0f)
                horizontalLineToRelative(3.851f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.034f)
                lineToRelative(-0.192f, 2.0f)
                horizontalLineToRelative(-2.009f)
                lineToRelative(0.385f, -4.0f)
                close()
            }
        }
        .build()
        return _siren!!
    }

private var _siren: ImageVector? = null
