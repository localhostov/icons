package me.localx.icons.straight.bold

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

public val Icons.Bold.CodeCommit: ImageVector
    get() {
        if (_codeCommit != null) {
            return _codeCommit!!
        }
        _codeCommit = Builder(name = "CodeCommit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.5f)
                horizontalLineToRelative(-5.162f)
                curveToRelative(-0.689f, -3.141f, -3.493f, -5.5f, -6.838f, -5.5f)
                reflectiveCurveToRelative(-6.149f, 2.359f, -6.838f, 5.5f)
                lineTo(0.0f, 10.5f)
                verticalLineToRelative(3.0f)
                lineTo(5.162f, 13.5f)
                curveToRelative(0.689f, 3.141f, 3.493f, 5.5f, 6.838f, 5.5f)
                reflectiveCurveToRelative(6.149f, -2.359f, 6.838f, -5.5f)
                horizontalLineToRelative(5.162f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _codeCommit!!
    }

private var _codeCommit: ImageVector? = null
