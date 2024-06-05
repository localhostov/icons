package me.localx.icons.rounded.bold

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

public val Icons.Bold.OctagonCheck: ImageVector
    get() {
        if (_octagonCheck != null) {
            return _octagonCheck!!
        }
        _octagonCheck = Builder(name = "OctagonCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.389f, 5.418f)
                lineToRelative(-3.808f, -3.808f)
                curveToRelative(-1.04f, -1.039f, -2.42f, -1.61f, -3.889f, -1.61f)
                horizontalLineToRelative(-5.385f)
                curveToRelative(-1.469f, 0.0f, -2.85f, 0.572f, -3.889f, 1.611f)
                lineToRelative(-3.808f, 3.808f)
                curveToRelative(-1.039f, 1.04f, -1.61f, 2.42f, -1.61f, 3.889f)
                verticalLineToRelative(5.385f)
                curveToRelative(0.0f, 1.469f, 0.572f, 2.85f, 1.611f, 3.889f)
                lineToRelative(3.808f, 3.808f)
                curveToRelative(1.04f, 1.039f, 2.42f, 1.61f, 3.889f, 1.61f)
                horizontalLineToRelative(5.385f)
                curveToRelative(1.469f, 0.0f, 2.85f, -0.572f, 3.889f, -1.611f)
                lineToRelative(3.808f, -3.808f)
                curveToRelative(1.039f, -1.04f, 1.61f, -2.42f, 1.61f, -3.889f)
                verticalLineToRelative(-5.385f)
                curveToRelative(0.0f, -1.469f, -0.572f, -2.85f, -1.611f, -3.889f)
                close()
                moveTo(21.0f, 14.692f)
                curveToRelative(0.0f, 0.667f, -0.26f, 1.296f, -0.732f, 1.768f)
                lineToRelative(-3.808f, 3.807f)
                curveToRelative(-0.472f, 0.472f, -1.101f, 0.732f, -1.768f, 0.732f)
                horizontalLineToRelative(-5.385f)
                curveToRelative(-0.667f, 0.0f, -1.296f, -0.26f, -1.768f, -0.732f)
                lineToRelative(-3.807f, -3.808f)
                curveToRelative(-0.472f, -0.472f, -0.732f, -1.101f, -0.732f, -1.768f)
                verticalLineToRelative(-5.385f)
                curveToRelative(0.0f, -0.667f, 0.26f, -1.296f, 0.732f, -1.768f)
                lineToRelative(3.808f, -3.807f)
                curveToRelative(0.472f, -0.472f, 1.101f, -0.732f, 1.768f, -0.732f)
                horizontalLineToRelative(5.385f)
                curveToRelative(0.667f, 0.0f, 1.296f, 0.26f, 1.768f, 0.732f)
                lineToRelative(3.807f, 3.808f)
                curveToRelative(0.472f, 0.472f, 0.732f, 1.101f, 0.732f, 1.768f)
                verticalLineToRelative(5.385f)
                close()
                moveTo(17.593f, 8.472f)
                curveToRelative(0.567f, 0.604f, 0.538f, 1.553f, -0.065f, 2.12f)
                lineToRelative(-4.145f, 3.896f)
                curveToRelative(-0.699f, 0.7f, -1.629f, 1.052f, -2.565f, 1.052f)
                curveToRelative(-0.946f, 0.0f, -1.898f, -0.36f, -2.622f, -1.084f)
                lineToRelative(-1.795f, -1.938f)
                curveToRelative(-0.563f, -0.608f, -0.526f, -1.557f, 0.082f, -2.12f)
                curveToRelative(0.608f, -0.563f, 1.557f, -0.527f, 2.12f, 0.082f)
                lineToRelative(1.755f, 1.896f)
                curveToRelative(0.23f, 0.229f, 0.668f, 0.229f, 0.938f, -0.042f)
                lineToRelative(4.178f, -3.928f)
                curveToRelative(0.604f, -0.569f, 1.553f, -0.539f, 2.12f, 0.065f)
                close()
            }
        }
        .build()
        return _octagonCheck!!
    }

private var _octagonCheck: ImageVector? = null
