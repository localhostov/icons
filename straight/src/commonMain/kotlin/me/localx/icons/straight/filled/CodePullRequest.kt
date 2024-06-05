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

public val Icons.Filled.CodePullRequest: ImageVector
    get() {
        if (_codePullRequest != null) {
            return _codePullRequest!!
        }
        _codePullRequest = Builder(name = "CodePullRequest", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(0.0f, 2.794f, 0.0f, 5.0f)
                curveToRelative(0.0f, 1.858f, 1.279f, 3.411f, 3.0f, 3.858f)
                verticalLineToRelative(7.284f)
                curveToRelative(-1.721f, 0.447f, -3.0f, 2.0f, -3.0f, 3.858f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.858f, -1.279f, -3.411f, -3.0f, -3.858f)
                verticalLineToRelative(-7.284f)
                curveToRelative(1.721f, -0.447f, 3.0f, -2.0f, 3.0f, -3.858f)
                close()
                moveTo(21.0f, 16.142f)
                lineTo(21.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-5.086f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.256f, 3.256f)
                curveToRelative(-0.774f, 0.775f, -0.775f, 2.036f, 0.0f, 2.812f)
                lineToRelative(3.256f, 3.256f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.214f, -2.203f)
                horizontalLineToRelative(5.007f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(9.142f)
                curveToRelative(-1.721f, 0.447f, -3.0f, 2.0f, -3.0f, 3.858f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.858f, -1.279f, -3.411f, -3.0f, -3.858f)
                close()
            }
        }
        .build()
        return _codePullRequest!!
    }

private var _codePullRequest: ImageVector? = null
