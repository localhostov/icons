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

public val Icons.Filled.CodeBranch: ImageVector
    get() {
        if (_codeBranch != null) {
            return _codeBranch!!
        }
        _codeBranch = Builder(name = "CodeBranch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.86f, 1.277f, 3.428f, 3.0f, 3.873f)
                verticalLineToRelative(0.127f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-1.125f, 0.0f, -2.164f, 0.374f, -3.0f, 1.002f)
                verticalLineTo(7.873f)
                curveToRelative(1.723f, -0.445f, 3.0f, -2.013f, 3.0f, -3.873f)
                curveTo(8.0f, 1.794f, 6.206f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveTo(0.0f, 1.794f, 0.0f, 4.0f)
                curveToRelative(0.0f, 1.86f, 1.277f, 3.428f, 3.0f, 3.873f)
                verticalLineToRelative(8.253f)
                curveToRelative(-1.723f, 0.445f, -3.0f, 2.013f, -3.0f, 3.873f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.86f, -1.277f, -3.428f, -3.0f, -3.873f)
                verticalLineToRelative(-0.127f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-0.127f)
                curveToRelative(1.723f, -0.445f, 3.0f, -2.013f, 3.0f, -3.873f)
                close()
            }
        }
        .build()
        return _codeBranch!!
    }

private var _codeBranch: ImageVector? = null
