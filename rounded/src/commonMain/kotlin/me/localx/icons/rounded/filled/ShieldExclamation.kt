package me.localx.icons.rounded.filled

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

public val Icons.Filled.ShieldExclamation: ImageVector
    get() {
        if (_shieldExclamation != null) {
            return _shieldExclamation!!
        }
        _shieldExclamation = Builder(name = "ShieldExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.581f, 2.14f)
                lineToRelative(-6.265f, -2.089f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.632f, 0.0f)
                lineToRelative(-6.266f, 2.089f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, false, -3.418f, 4.743f)
                verticalLineToRelative(5.117f)
                curveToRelative(0.0f, 7.563f, 9.2f, 11.74f, 9.594f, 11.914f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.812f, 0.0f)
                curveToRelative(0.394f, -0.174f, 9.594f, -4.351f, 9.594f, -11.914f)
                verticalLineToRelative(-5.117f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, false, -3.419f, -4.743f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(13.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shieldExclamation!!
    }

private var _shieldExclamation: ImageVector? = null
