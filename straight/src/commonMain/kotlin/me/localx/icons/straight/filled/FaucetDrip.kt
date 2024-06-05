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

public val Icons.Filled.FaucetDrip: ImageVector
    get() {
        if (_faucetDrip != null) {
            return _faucetDrip!!
        }
        _faucetDrip = Builder(name = "FaucetDrip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, 4.037f, 9.0f, 9.0f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(11.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _faucetDrip!!
    }

private var _faucetDrip: ImageVector? = null
